package com.example.bogdan.calculatorforparty.entity;

/**
 * @author Bogdan Kolomiets
 * @version 1
 * @date 07.08.16
 */
public class OperationItem {
  private String mName;
  private double mMoney;

  public OperationItem(String name, double money) {
    mName = name;
    mMoney = money;
  }

  public String getName() {
    return mName;
  }

  public double getMoney() {
    return mMoney;
  }
}
