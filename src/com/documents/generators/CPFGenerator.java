package com.documents.generators;

import java.util.Random;

/**
 * <h1>CPF Generator</h1>
 * <p>
 * This class is a simple Java CPF Generator with
 * base in Brazil Pattern
 * 
 * @author João Gabriel Valentim Theodoro
 * @version 1.0
 * @since 2025-08-11
 */
public class CPFGenerator {
  private final int[] cpfDigits;
  private final Random random;

  public CPFGenerator() {
    cpfDigits = new int[11];
    random = new Random();
  }

  /**
   * This method format CPF in pattern <strong>XXX.XXX.XXX-XX</strong>
   * 
   * @param digits
   * @return pattern
   * @see #formatCpf(int[])
   */
  private String formatCpf(int[] digits) {
    final String pattern = String.format("%s%s%s.%s%s%s.%s%s%s-%s%s",
        digits[0], digits[1], digits[2],
        digits[3], digits[4], digits[5],
        digits[6], digits[7], digits[8],
        digits[9], digits[10]);
    return pattern;
  }

  /**
   * This method calculate a valid and verified digit of CPF
   * 
   * @param digits
   * @param position
   * @return mod
   * @see #calculateVerifiedDigit(int[], int)
   */
  private int calculateVerifiedDigit(int[] digits, int position) {
    int sum = 0;
    int weight = position + 1;

    for (int i = 0; i < position; i++) {
      sum += digits[i] * weight;
      weight--;
    }

    int mod = sum % 11;
    return (mod < 2) ? 0 : 11 - mod;
  }

  /**
   * This method generate a unique cpf
   * 
   * @return formatCpf(cpfDigits)
   * @see #generateCPF()
   */
  private String generateCPF() {

    for (int i = 0; i < 9; i++) {
      cpfDigits[i] = random.nextInt(10);
    }

    cpfDigits[9] = calculateVerifiedDigit(cpfDigits, 9);
    cpfDigits[10] = calculateVerifiedDigit(cpfDigits, 10);

    return formatCpf(cpfDigits);
  }

  /**
   * This get generated cpf
   * 
   * @return generateCPF()
   * @see #generateCPF()
   */
  public String getRandomCPF() {
    return generateCPF();
  }

  /**
   * This get generated cpf list
   * 
   * @return cpfsList
   * @see #getRandomCPFList()
   */
  public String[] getRandomCPFList() {
    final String[] cpfsList = new String[10];

    for (int i = 0; i < cpfsList.length; i++) {
      cpfsList[i] = getRandomCPF();
    }

    return cpfsList;
  }

  /**
   * This get generated cpf list
   * 
   * @param total
   * @return cpfsList
   * @see #getRandomCPFList(int)
   */
  public String[] getRandomCPFList(int total) {
    final String[] cpfsList = new String[total];

    for (int i = 0; i < cpfsList.length; i++) {
      cpfsList[i] = getRandomCPF();
    }

    return cpfsList;
  }
}
