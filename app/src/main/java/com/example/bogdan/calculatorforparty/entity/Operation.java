package com.example.bogdan.calculatorforparty.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bogdan Kolomiets
 * @version 1
 * @date 07.08.16
 */
public class Operation {
  private List<OperationItem> mOperations;
  private double mAmountPerPerson = 0;

  public Operation() {
    mOperations = new ArrayList<>();
  }

  public void addNewOperation(OperationItem operation) {
    mOperations.add(operation);
  }

  public void amountPerPerson() {
    for (OperationItem item : mOperations) {
      mAmountPerPerson += item.getMoney();
    }
  }
}
