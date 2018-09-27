package ru.valiullin.Library;

import java.io.Serializable;

public class YongReadeer implements Serializable {
    private static final long serialVersionUID = 3818806049679265123L;
    private String nickName;
    private String accountName;
    private transient String accountPassword;

    public YongReadeer(String nickName, String accountName, String accountPassword) {
        this.nickName = nickName;
        this.accountName = accountName;
        this.accountPassword = accountPassword;
    }

    public void readLiterature() {
        System.out.println(this.nickName + " читает что то");
    }
}
