package ilentt.ilenlab.com.exception;

import org.springframework.dao.EmptyResultDataAccessException;

public class OrdersNotFound extends EmptyResultDataAccessException {
    /**
     * 
     */
    private static final long serialVersionUID = 2140367774667570601L;
    private static final int EXPECTED_SIZE = 1;

    public OrdersNotFound(String message) {
        super(message, EXPECTED_SIZE);
        // TODO Auto-generated constructor stub
    }
}
