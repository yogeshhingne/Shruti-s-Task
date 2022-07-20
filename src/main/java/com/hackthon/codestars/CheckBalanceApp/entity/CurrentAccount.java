package com.hackthon.codestars.CheckBalanceApp.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name ="current_account",uniqueConstraints= @UniqueConstraint(columnNames={"accountNo", "mobileNo","panNo"}))
public class CurrentAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int currentId;
    private String bankName;
    private String accountType;
    private long accountNo;
    private long mobileNo;
    private String dateOfBirth;
    private String panNo;
    private double currentAccountBalance;
}
