#include<stdio.h>
//                                                   File Writing  
/*void main()
{
    FILE *ptr=NULL;
    ptr=fopen("a.txt","w");
    if(ptr==NULL)
    {
        printf("No such File");
    }
    else
    {
        char c='A';
        fputc(c,ptr);
        char ch[20];
        gets(ch);
        fputs(ch,ptr);
        fprintf(ptr,"Who is better");
        char c2[20]="How are you?";
        fprintf(ptr,"%s",c2);
    }
}*/

//                                                   File Reading
/*void main()
{
    FILE *ptr;
    char ch;
    ptr=fopen("a.txt","r");
    while(1)
    {
        ch=fgetc(ptr);
        if(ch==EOF)
        {
            break;
        }
        else
        {
            printf("%c",ch);
        }
    }
    fclose(ptr);
}*/