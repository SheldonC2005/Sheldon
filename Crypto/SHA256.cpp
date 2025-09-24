#include <iostream>
#include <bitset>
#include <vector>
#include <iomanip>
#include <cstdint>

using namespace std;

string charToBinary(char c)
{
    return bitset<8>(c).to_string();
}

uint64_t rotr(uint64_t value, unsigned int count)
{
    return (value >> count) | (value << (64 - count));
}

uint64_t sigma_0(uint64_t x)
{
    return rotr(x, 1) ^ rotr(x, 8) ^ (x >> 7);
}

uint64_t sigma_1(uint64_t x)
{
    return rotr(x, 19) ^ rotr(x, 61) ^ (x >> 6);
}

int main()
{
    string plaintext = "";
    cout << "Enter the plain text : ";
    cin >> plaintext;
    int bit_length = plaintext.length() * 8;
    int message_length_mod = 896;
    int padding_length = message_length_mod - (bit_length % 1024);
    if (padding_length <= 0)
    {
        padding_length += 1024;
    }
    cout << "Original Message Length (in bits): " << bit_length << endl;
    cout << "Required Padding Length (in bits): " << padding_length << endl;
    cout << "Padding starts with '1' followed by " << (padding_length - 1) << " zero bits." << endl;

    string binaryString = "";
    for (char c : plaintext)
    {
        binaryString += charToBinary(c);
    }
    cout << "Binary Representation: " << binaryString << endl;

    int messageLength = binaryString.length();

    int totalBits = 1024;
    int paddingBits = totalBits - (messageLength + 128);
    binaryString += "1";
    binaryString.append(paddingBits - 1, '0');

    string messageLengthBinary = bitset<128>(messageLength).to_string();
    binaryString += messageLengthBinary;

    cout << "Padded Message: " << binaryString << endl;
    vector<uint64_t> words(80, 0);
    for (int i = 0; i < 16; i++)
    {
        words[i] = stoull(binaryString.substr(i * 64, 64), nullptr, 2);
    }

    for (int i = 16; i < 80; i++)
    {
        words[i] = sigma_1(words[i - 2]) + words[i - 7] + sigma_0(words[i - 15]) + words[i - 16];
    }

    cout << "First few 64-bit words in hex:\n";
    for (int i = 0; i < 18; i++)
    {
        cout << std::dec << "W[" << i << "] = 0x" << std::hex << hex << setw(16) << setfill('0') << words[i] << endl;
    }

    int A = 0b01100001;
    int B = 0b01100010;
    int C = 0b01100011;
    int E = 0b01100101;
    int F = 0b01100110;
    int G = 0b01100111;
    int Majority = (A & B) ^ (A & C) ^ (B & C);
    int Condition = (E & F) ^ (~E & G);

    cout << "Majority Function: " << bitset<8>(Majority) << endl;
    cout << "Condition Function: " << bitset<8>(Condition) << endl;
    return 0;
}