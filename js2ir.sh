#!/bin/bash
printf "\033[40;37m\n"
js2c toc $1 $1.c
sleep 1
printf "void print(char *c){\n}\n\n" > /tmp/$1.c
cat $1.c >> /tmp/$1.c
clang -emit-llvm -c -S /tmp/$1.c -o $1.ll
