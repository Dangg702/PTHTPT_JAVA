package com.gpcoder.ws;
 
import lombok.Data;
// lombok là thư viện tự sinh các phương thức getter/setter/contructor/toString... và tinh gọn chúng.
// lombok generate các phương thức trong tập tin .class
//@Data là cách dùng nhanh khi muốn thêm tất cả các annotation của Lombok vào 1 class
//@Data --> sinh các hàm get/set/contructor một cách tự động
//Nếu muốn loại bỏ getter() method -->  @Getter(AccessLevel.NONE)
//

@Data
public class User {
 
    private Integer id;
    private String username;
    
    public User() {
		super();
	}
	public User(Integer id, String username) {
		super();
		this.id = id;
		this.username = username;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
