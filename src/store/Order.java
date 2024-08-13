package store;

import lombok.Getter;

import java.util.List;

@Getter
public class Order {

    private List<Food> foods;
    private double transactionFeePercent = 0.03; //결제 수수료 3%
}
