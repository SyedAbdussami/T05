package com.pouriarm.remotermi.client;

import com.pouriarm.remotingrmi.core.Dictionary;
import com.pouriarm.remotingrmi.core.DictonaryException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

import java.rmi.RemoteException;
import java.util.Map;

@SpringBootApplication
public class RemotingRmiClientApplication {

    //TODO: Declare the RmiProxyFactoryBean that will create a bean( Hint: Use RmiProxyFactoryBean )
    //
    @Bean
    RmiProxyFactoryBean service() {
        RmiProxyFactoryBean rmiProxyFactory = new RmiProxyFactoryBean();
        rmiProxyFactory.setServiceUrl("rmi://localhost:6231/Dictionary");
        rmiProxyFactory.setServiceInterface(Dictionary.class);
        return rmiProxyFactory;
    }


    // Complete the second test part to run the client.
    public static void main(String[] args) throws DictonaryException, RemoteException {
        Dictionary service = SpringApplication.run(RemotingRmiClientApplication.class, args).getBean(Dictionary.class);
        String line = "I am student at Concordia University. This is my favourite course at Concordia University.";

        Map<String, Integer> res = service.word(line);
        System.out.println("response (String line): " + res);

        //TODO: Run it on the second word method.
        String[] wordArray = line.split(" ");
        Map<String, Integer> res1 = service.word(wordArray);
        System.out.println("response (String[] lines):" + res1);


    }
}
