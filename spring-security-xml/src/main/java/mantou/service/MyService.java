package mantou.service;

import org.springframework.security.access.prepost.PreAuthorize;

/**
 * Created by chenjunjun on 2017/11/18.
 */
public class MyService {

    @PreAuthorize("hasRole('ADMIN')")
    public void testAuthMethod(){
        System.out.println("Hello World");
    }
}
