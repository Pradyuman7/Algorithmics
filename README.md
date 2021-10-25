# Algorithmics

![Algorithmics](https://github.com/Pradyuman7/Algorithmics/actions/workflows/main.yml/badge.svg) 
[![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat)](https://github.com/dwyl/esta/issues)
[![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)](https://opensource.org/licenses/MIT)

### A Java library for people who want to implement some algorithms quickly. :confetti_ball:

<!-- TABLE OF CONTENTS -->
## Table of Contents

  - [List of Current Algorithmics' Classes (Inside Package Algorithms)](#list-of-current-algorithmics-classes-inside-package-algorithms)
  - [How to Use](#how-to-use)
  - [License](#license)
  - [Contributions](#contributions)
  - [Documentation](#documentation)

## List of Current Algorithmics' Classes (Inside package Algorithms)

| Name | Description |
|---|---|
| `SievePrimesAlgorithm` | Find and Generate Prime numbers using Sieve's algorithm. |
| `NumOccurencesOfCharacters` | Find number of occurences of different/particular character(s) in a string. |
| `Divisors` | Find number of divisors of the number of your choice. |
| `CheckPrime` | Check if a number is prime or not, efficiently. |
| `GetDivSquareSum` | Get sum of squares of divisors of a number efficiently. |
| `BinarySearch` | Search result for a number in an array of integers. |
| `MaxSubArraySum` | Find the maximum continuous sub array sum in a given array. |
| `FindMaxSubArrayProduct` | Find the maximum continuous sub array product in a given array of fixed length and no length constraint. |
| `Exponent` | Calculate exponents of natural numbers. |
| `FindPhrase` | Find number of occurences of a smaller string in a bigger string. |
| `Find2DMatrixSum` | Find sum of 2d matrix with long and int return types. |
| `CountDistinctElements` | Returns the number of distinct elements in an integer array |
| `CountSorting` | Returns the sorted array after sorting via count sort algorithm |
| `MatrixMultiplication2D` | Returns the multiplied matrix (if possible or returns null) |
| `PerfectPowerAlgorithm` | Returns the root and the exponent in an array of size 2 for a given natural number n (or null) |

## How to use

### Migrated to a maven project now, thanks to [sliard](https://github.com/sliard).

## License
[![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)](https://opensource.org/licenses/MIT)

**Algorithmics** is under *MIT License*. See **[License](License.md)** for more info.

## Contributions

Do you want to contribute to Algorithmics? Awesome, there're not many rules but just a few things to consider before making a PR, simply refer to [CONTRIBUTING.md](./CONTRIBUTING.md) and some guidelines in the available issues.

1. Fork the Project and Clone the repository.
   > `git clone https://github.com/Pradyuman7/Algorithmics.git`
2. Create your Feature Branch 
   > `git checkout -b feature/AmazingFeature`
3. Commit your Changes 
   > `git commit -m 'feat: Add some AmazingFeature'`
4. Push to the Branch
   > `git push -u origin feature/AmazingFeature`
5. Open a Pull Request

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

##Checkstyle guide

This repository follows the [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html). Feel free to download formatting presets for your IDE from [Google's GitHub repository](https://github.com/google/styleguide).
We have set up [checkstyle](https://github.com/Pradyuman7/Algorithmics/blob/master/checkstyle.xml) to enforce them throughout this project. You can check locally if your changes comply with these guidelines by executing the maven goal `compile`. If the build of your Pull Request fails make sure to checkout the logs in the checks of your Pull Request to see what exactly does not comply with our guidelines. If you think that you are still complying with the guidelines, feel free to make corresponding changes to our [checkstyle file](https://github.com/Pradyuman7/Algorithmics/blob/master/checkstyle.xml).

## Documentation
Kindly refer [Docs.md](./Docs.md)
