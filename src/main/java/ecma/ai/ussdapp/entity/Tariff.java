package ecma.ai.ussdapp.entity;

import ecma.ai.ussdapp.entity.enums.ClientType;
import ecma.ai.ussdapp.entity.template.AbsEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Data
public class Tariff extends AbsEntity {

    @Column(nullable = false, unique = true)
    private String name;

    private double price; //tariff narxi

    private double switchPrice; //o'tish narxi

    private int expireDate; // amal qilish muddati

    private int mb; // tarif rejasi doirasida beriladigan mb miqdori
    private int sms; // tarif rejasi doirasida beriladigan sms miqdori
    private int min; // tarif rejasi doirasida beriladigan min miqdori
    private int mbCost; // mb tugaganda 1mb narxi
    private int smsCost; // sms tugaganda 1sms narxi
    private int minCost; // min tugaganda 1min narxi

    @Enumerated(EnumType.STRING)
    private ClientType clientType;

}
