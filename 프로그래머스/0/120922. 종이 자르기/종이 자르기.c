#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int M, int N) {
    int answer = ((N-1) * M)+M-1;
    return answer;
}