################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../src/Linux\ Commands.c 

OBJS += \
./src/Linux\ Commands.o 

C_DEPS += \
./src/Linux\ Commands.d 


# Each subdirectory must supply rules for building sources it contributes
src/Linux\ Commands.o: ../src/Linux\ Commands.c
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C Compiler'
	gcc -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"src/Linux Commands.d" -MT"src/Linux\ Commands.d" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


