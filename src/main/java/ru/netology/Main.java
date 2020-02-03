package ru.netology;

import ru.netology.model.PurchaseItem;
import ru.netology.service.CartService;
import ru.netology.service.CashbackHackService;


public class Main {
    public static void main(String[] args) {
        CashbackHackService hack1 = new CashbackHackService();
        System.out.println(hack1.remain(900));
        System.out.println(hack1.remain(1000));
        System.out.println(hack1.remain(-200));
        System.out.println(hack1.remain(2000));


        CartService service = new CartService();
        service.add(new PurchaseItem(1, 2000, 1));
        service.add(new PurchaseItem(2, 4000, 5));
        service.add(new PurchaseItem(3, 6000, 4));
        service.add(new PurchaseItem(4, 8000, 3));
        service.add(new PurchaseItem(5, 10000, 2));
        service.add(new PurchaseItem(6, 1000, 1));
//        System.out.println(service.sortedBy(new PriceAscComparator()));

//        Comparator<PurchaseItem> comparator = new Comparator<PurchaseItem>() {
//            @Override
//            public int compare(PurchaseItem o1, PurchaseItem o2) {
//                return 0;
//            }
//        };
//        System.out.println(service.sortedBy(comparator));

//        System.out.println(service.sortedBy(new Comparator<PurchaseItem>() {
//            @Override
//            public int compare(PurchaseItem o1, PurchaseItem o2) {
//                return 0;
//            }
//        }));


//        System.out.println(service.sortedBy((PurchaseItem o1, PurchaseItem o2) ->{
//         return o1.getItemPrice()-o2.getItemPrice();}));

//        System.out.println(service.sortedBy(( o1,  o2) ->{
//            return o1.getItemPrice()-o2.getItemPrice();}));
        System.out.println("");
        System.out.println("");
        System.out.println(service.sortedBy((o1, o2) -> o1.getItemPrice() - o2.getItemPrice()));

    }

}
