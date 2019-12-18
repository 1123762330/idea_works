package cn.itheima.test2.view;

import cn.itheima.test2.dao.ContactDao;
import cn.itheima.test2.entity.Contact;
import java.util.List;

public class ContactView {
    public static void main(String[] args) {
        new ContactView().showMyContact();
    }

    private void showMyContact(){
        ContactDao dao =  new ContactDao();
        //通过dao对象调用方法
        List<Contact> list = dao.findMyContact();
        //遍历集合
        for (Contact contact : list) {
            System.out.println(contact);
        }
    }


}
