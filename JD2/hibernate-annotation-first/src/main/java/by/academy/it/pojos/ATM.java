package by.academy.it.pojos;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Sukora Stas.
 */
public class ATM implements Serializable {
    private static final long serialVersionUID = 3L;
    @Id
    private Integer id;
    @Column
    private String Names_of_divisions ;
    @Column
    private String Region;
    @Column
    private String Locality;

}
