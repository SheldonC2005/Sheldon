#include<stdio.h>
typedef enum {THINKING,HUNGRY,EATING} State;
void think(int philosopher)
{
    printf("\nPhilosopher %d is thinking",philosopher);
}
void eat(int philosopher)
{
    printf("\nPhilosopher %d is eating",philosopher);
}
int can_eat(int philosopher,int forks[])
{
    return forks[philosopher] && forks[(philosopher+1)%5];
}
void take_forks(int philosopher,int forks[])
{
    forks[philosopher]=0;
    forks[(philosopher+1)%5]=0;
}
void put_forks(int philosopher,int forks[])
{
    forks[philosopher]=1;
    forks[(philosopher+1)%5]=1;
}
void action(int philosopher,int forks[],State *state)
{
    switch(state[philosopher])
    {
        case THINKING:
        state[philosopher]=HUNGRY;
        printf("\nPhilosopher %d is hungry",philosopher);
        break;

        case HUNGRY:
        if(can_eat(philosopher,forks))
        {
            take_forks(philosopher,forks);
            state[philosopher]=EATING;
            eat(philosopher);
        }
        else
        {
            think(philosopher);
        }
        break;

        case EATING:
        put_forks(philosopher,forks);
        state[philosopher]=THINKING;
        think(philosopher);
        break;
    }
}
int main()
{
    int forks[5]={1,1,1,1,1};
    State state[5]={THINKING,THINKING,THINKING,THINKING,THINKING};
    for(int i=0;i<10;i++)
    {
        for(int philosopher=0;philosopher<5;philosopher++)
        {
            action(philosopher,forks,state);
        }
        printf("\n");
    }
    return 0;
}