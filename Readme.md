# Swiss Tax Calculator - Coding Exercise

Your goal is to implement a generic tax calculator for various communities in Switzerland. 
In Switzerland, different communities may have different tax rates and follow a progressive taxation system.

The step progression for three communities is provided in [TaxConfiguration.java](src/main/java/ch/abraxas/TaxConfiguration.java). 
Each progression configuration consists of a list with tax brackets (Steuerklassen), each having an upper bound in Swiss Francs and a rate (Steuersatz) in percent. 
The list is sorted, with the first entry being the lowest bracket and the last one the highest.

Your task is to implement the function in [TaxCalculator.java](src/main/java/ch/abraxas/TaxCalculator.java) that selects the appropriate band depending on the income provided and performs a calculation based on the formula written below. 
Incomes that are higher than the upper bound of the progression configuration can be ignored.

The user can input the name of the community (as an uppercase string) and the income of the taxpayer (in double format), and the application prints the calculated income tax to the console.

```bash
Enter community: ABRAXIEN
Enter income: 12000
Calculated Tax: 700.0
```
Given the progression configuration for ABRAXIEN:
- 1’000 CHF, 2%
- 8’000 CHF, 4%
- 20’000 CHF, 10%

And an income of 12’000 CHF

The income tax would be 700 CHF.

### Explanation
For an income of 12’000 CHF, the first 1'000 CHF are taxed at 2%, the next 7'000 CHF are taxed at 4%, and the remaining 4'000 CHF are taxed at 10%.
```
1'000 CHF * 2% + 7'000 CHF * 4% + 4'000 * 10% = 20 CHF + 280 CHF + 400 CHF = 700 CHF
```

For an income of 5'000 CHF the tax would be 180 CHF:

```
1'000 CHF * 2% + 4'000 CHF * 4% = 20 CHF + 160 CHF = 180 CHF
```
However, an income of 25’000 CHF would lead to an error and can be ignored, as it exceeds the upper bound of 20’000 CHF in the given progression configuration.

### Progression Configuration

The current configurations for different communities are:

#### ABRAXIEN:
- 1’000 CHF, 2%
- 8’000 CHF, 4%
- 20’000 CHF, 10%

#### POLARIS:
- 1’000 CHF, 0%
- 4’000 CHF, 10%
- 50’000 CHF, 20%
- 100’000 CHF, 50%

#### STEUERION:
- 20’000 CHF, 10%

### Hints

- Don't worry, while basic math is required to calculate the tax, this is primarily an algorithm exercise, not a math exercise. You only need a basic understanding of Java and concepts like loops.
- Normally, for such calculations, BigDecimal data type would be used, and results would be rounded to 5 Rappen for billing purposes. In this exercise, use the double data type and output results without rounding.
