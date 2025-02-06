/*#include<stdio.h>
int mutex=1,full=0,empty=3,x=0;

int signal(int n)
{
    return ++n;
}

int wait(int n)
{
    return --n;
}

void producer()
{
    mutex=wait(mutex);
    full=signal(full);
    empty=wait(empty);
    x++;
    printf("\nProducer produces item %d",x);
    mutex=signal(mutex);
}

void consumer()
{
    mutex=wait(mutex);
    full=wait(full);
    empty=signal(empty);
    printf("\nConsumer consumes item %d",x);
    x--;
    mutex=signal(mutex);
}

int main()
{
    int n;
    printf("\n1.Producer");
    printf("\n2.Consumer");
    printf("\n3.Terminate program");
    do
    {
        printf("\nEnter choice:");
        scanf("%d",&n);
        switch(n)
        {
            case 1:
            if(mutex==1 && empty!=0)
            {
                producer();
                break;
            }
            else
            {
                printf("\nBuffer is full!!");
            }

            case 2:
            if(mutex==1 && full!=0)
            {
                consumer();
                break;
            }
            else
            {
                printf("\nBuffer is empty!!");
            }
        }
    }while(n!=3);
    return 0;
}*/

#include <stdio.h>
#define N 5
typedef enum { THINKING, HUNGRY, EATING } State;

void think(int philosopher)
{
    printf("Philosopher %d is thinking\n", philosopher);
}

void eat(int philosopher)
{
    printf("Philosopher %d is eating\n", philosopher);
}

int can_eat(int philosopher, int forks[])
{
    return forks[philosopher] && forks[(philosopher + 1) % N];
}

void pick_up_forks(int philosopher, int forks[])
{
    forks[philosopher] = 0;
    forks[(philosopher + 1) % N] = 0;
}

void put_down_forks(int philosopher, int forks[])
{
    forks[philosopher] = 1;
    forks[(philosopher + 1) % N] = 1;
}

void philosopher_action(int philosopher, int forks[], State *state)
{
    switch (state[philosopher])
    {
        case THINKING:
            state[philosopher] = HUNGRY;
            printf("Philosopher %d is hungry\n", philosopher);
            break;
        case HUNGRY:
            if (can_eat(philosopher, forks))
            {
                pick_up_forks(philosopher, forks);
                state[philosopher] = EATING;
                eat(philosopher);
            }
            else
            {
                think(philosopher);
            }
            break;
        case EATING:
            put_down_forks(philosopher, forks);
            state[philosopher] = THINKING;
            think(philosopher);
            break;
    }
}

int main()
{
    int forks[N] = {1, 1, 1, 1, 1};
    State state[N] = {THINKING, THINKING, THINKING, THINKING, THINKING};
    for (int i = 0; i < 10; i++)
    {
        for (int p = 0; p < N; p++)
        {
            philosopher_action(p, forks, state);
        }
        printf("\n");
    }
    return 0;
}