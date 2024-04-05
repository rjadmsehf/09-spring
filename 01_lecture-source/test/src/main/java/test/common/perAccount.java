package test.common;

import lombok.ToString;

@ToString
public class perAccount implements/* */ Account{
    private final int bankCode;  // 은행코드
    private final String accNo;  // 계좌번호
    private  int balance;        // 잔액

    public perAccount(int bankCode, String accNo){
        this.bankCode = bankCode;
        this.accNo = accNo;
    }

    @Override
    public String getBalance() {
        return this.accNo + "계좌의 현재 잔액은" + this.balance + "원 입니다.";
    }

    @Override
    public String deposit(int money) {

        String str = "";

        if(money >= 0) {
            this.balance += money;
            str = money + "원이 입금되었습니다!!";
        }else {
            str = "금액을 잘못 입력했습니다!!";
        }
        return str;
    }

    @Override
    public String withDraw(int money) {

        String str = "";

        if (this.balance >= money) {
            this.balance -= money;
            str = money + "원이 출금되었습니다.";
        }else {
            str = "잔액 부족";

        }
        return str;
    }
}
