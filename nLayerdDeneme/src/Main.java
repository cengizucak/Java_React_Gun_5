import business.abstracts.ProductService;
import business.concretes.ProductManager;
import core.JLoggerAdapter;
import dataAccess.concretes.AbcProductDao;
import dataAccess.concretes.HibernateProductDao;
import entities.concretes.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //? Bir projede Entiy'ler haric new'liyorsaniz problem yasarsiniz

        //todo Spring IOC ile cözulecek

        //todo interface'ler somut siniflarin referansini tutabilir. Burda sag taraf interface degil
        //todo Sag taraf aslinda bir manager

        //ProductService productService = new ProductManager(new HibernateProductDao());
        ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerAdapter());

        Product product=new Product(1,2,"Elma",12,50);

        productService.add(product);

    }
}
