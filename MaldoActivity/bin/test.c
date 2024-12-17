#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define MAX_SIZE 9

void instruction()
{
    printf("\nREVERSE - A GAME OF SKILL\n");
    printf("Instructions:\n");
    printf("To win the game, arrange a list of numbers in numerical order from left to right.\n");
    printf("To move, you tell me how many numbers (counting from left to right) to reverse.\n");
    printf("For example, if the current list is [2, 3, 4, 5, 1, 6, 7, 8] and you reverse the first 3 numbers, the result will be [5, 4, 3, 2, 1, 6, 7, 8].\n");
    printf("To quit the game, reverse 0.\n");
    printf("LEVELS:\n");
    printf("1. Easy: 20 moves\n");
    printf("2. Average: 15 moves\n");
    printf("3. Difficult: 7 moves\n");

}
void random_list(int list[], int size) {
    for (int i = 0; i < size; i++) {
        list[i] = i + 1;
    }
    
    for (int i = 0; i < size; i++) {
        int j = rand() % size;
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}
void display_list(int list[], int size) {
    for (int i = 0; i < size; i++) {
        printf("%d", list[i]);
    }
    printf("\n");
}
void reverse(int list[], int size, int n) {
    for (int i = 0; i < n / 2; i++) {
        int temp = list[i];
        list[i] = list[n - 1 - i];
        list[n - 1 - i] = temp;
    }
}
int is_sorted(int list[], int size) {
    for (int i = 1; i < size; i++) {
        if (list[i - 1] > list[i]) {
            return 0; 
        }
    }
    return 1; 
}
int main()
{
srand(time(NULL));

    int list[MAX_SIZE];
    int moves = 0, max_moves;
    int difficulty;

    instruction();
printf("Select difficulty (1 - Easy, 2 - Average, 3 - Difficult): ");
    scanf("%d", &difficulty);

    switch (difficulty) {
        case 1:
            max_moves = 20;
            break;
        case 2:
            max_moves = 15;
            break;
        case 3:
            max_moves = 7;
            break;
        default:
            printf("Invalid difficulty level! Defaulting to Easy (20 moves).\n");
            max_moves = 20;
            break;
    }

    // Generate random list
    random_list(list, MAX_SIZE);

    printf("\nThe list is: ");
    display_list(list, MAX_SIZE);

    while (moves < max_moves) {
        int n;
        printf("How many shall I reverse? ");
        scanf("%d", &n);

        // Check for invalid input
        if (n < 0 || n > MAX_SIZE) {
            printf("Invalid input! Please enter a number between 0 and %d.\n", MAX_SIZE);
            continue;
        }

        // Reverse the first 'n' elements
        reverse(list, MAX_SIZE, n);

        printf("The list is: ");
        display_list(list, MAX_SIZE);

        moves++;

        if (is_sorted(list, MAX_SIZE)) {
            printf("You WON IT IN %d MOVES! TRY AGAIN? (YES/NO): ", moves);
            char response[4];
            scanf("%s", response);

            if (response[0] == 'Y' || response[0] == 'y') {
                random_list(list, MAX_SIZE);
                printf("\nThe list is: ");
                display_list(list, MAX_SIZE);
                moves = 0;
            } else {
                break;
            }
        }
    }

    if (moves == max_moves) {
        printf("Game Over! You've reached the maximum number of moves.\n");
    }

    return 0;
}
