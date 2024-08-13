package store;

import lombok.Getter;

import java.util.List;

@Getter //Getter가 필요한 이유는 멤버 변수의 최신화가 보장된 값을 가져와 연산하기 위함. 보통의 멤버 변수는 private으로 선언됨. 그렇기 때문에 외부에서 해당 값에 접근하기 위해서 getter를 사용해줌.
public class RestaurantChain {

    private List<Store> stores;

    //매출을 계산하는 함수 : 매출은 팔린 음식의 가격을 다 더하고, 음식 수를 다 더하고, 해당 주문을 다 더하고, 해당 가맹점을 다 더하면 매출이 나온다.
    public long calculateRevenue() {
        long revenue = 0;

        for (Store store : stores) {
            for (Order order : store.getOrders()) {
                for (Food food : order.getFoods()) {
                    revenue += food.getPrice();
                }
            }
        }
        return revenue;
    }

    //순이익을 계산하는 함수
    public long calculateProfit() {
        long cost = 0;
        for (Store store : stores) {
            for (Order order : store.getOrders()) {
                long orderPrice = 0;
                for (Food food : order.getFoods()) {
                    orderPrice += food.getPrice();
                    cost += food.getOriginCost();
                }
                //결제 금액의 3%를 비용으로 잡는다.
                cost += orderPrice * order.getTransactionFeePercent();
            }
            cost += store.getRentalFee();
        }
        return calculateRevenue() - cost;
    }
}
