import business.abstracts.ProductService;
import business.concretes.ProductManager;
import core.JLoggerManagerAdapter;
import dataAccess.concretes.AbcProductDao;
import dataAccess.concretes.HibernateProductDao;
import entities.concretes.Product;

public class Main {

    public static void main(String[] args) {

        //todo  : Spring IoC ile cözulecek

        //todo  : intefaceler somut siniflarin referanslarini tutabilir

        //todo  : bu sag taraf ( new ProductManager(new HibernateProductDao()); interface degil, bir manager )



        ProductService productService= new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());

        Product product = new Product(1,2,"Elma",12,50);

        productService.add(product);
    }
}
