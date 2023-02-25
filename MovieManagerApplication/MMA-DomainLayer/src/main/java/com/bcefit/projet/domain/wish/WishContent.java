package com.bcefit.projet.domain.wish;

import com.bcefit.projet.domain.user.UserAccount;

import javax.persistence.*;

@MappedSuperclass
public abstract class WishContent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_wish", nullable = false)
    private Long idWish;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private UserAccount userAccount;


    public WishContent(Long idWish, UserAccount userAccount) {
        this.idWish = idWish;
        this.userAccount = userAccount;
    }

    public WishContent() {

    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public Long getIdWish() {
        return idWish;
    }

    public void setIdWish(Long idWish) {
        this.idWish = idWish;
    }

}
