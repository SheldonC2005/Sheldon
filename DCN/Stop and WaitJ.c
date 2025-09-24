#include <stdio.h>
#include <string.h>
#define MAX_FRAME_SIZE 1024
void send_frame(char bit, int frame_number)
{
    printf("Sender: Sending frame %d -> %c\n", frame_number, bit);
}
void receive_frame(char bit, int frame_number)
{
    printf("Receiver: Received frame %d -> %c\n", frame_number, bit);
    printf("Receiver: Sending ACK for frame %d\n", frame_number);
}
int main()
{
    char data[MAX_FRAME_SIZE];
    int frame_number = 0;
    printf("Enter data to send: ");
    fgets(data, MAX_FRAME_SIZE, stdin);
    data[strcspn(data, "\n")] = '\0';
    for (int i = 0; i < strlen(data); i++)
    {
        send_frame(data[i], frame_number);
        receive_frame(data[i], frame_number);
        frame_number++;
    }
    printf("Transmission complete.\n");
    return 0;
}