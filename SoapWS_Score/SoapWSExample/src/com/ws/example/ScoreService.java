package com.ws.example;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

//EJB là 1 thành phần nằm ở phía server -side của 1 ứng dụng web.
//Nhiệm vụ chính là sử lý các nghiệp vụ logic và truy suất dữ liệu.
//EJB là 1 nền tảng cho phép xây dựng phần mềm có tính di động , có khả năng tái sử dụng cao, tính bảo mật cao
//EJB là 1 thành phần hướng tới các ứng dụng có quy mô lớn, thích hợp với mô hình phân tán.

//@Stateless biểu thị nó là một bean không trạng thái. EJB Container 
//tự động tạo các cấu hình hoặc giao diện có liên quan được yêu cầu bằng cách 
//đọc chú thích này trong quá trình triển khai.

//Stateless là thiết kế không lưu dữ liệu của client trên server. 
//Trạng thái client sẽ không được lưu lại cho những lần giao dịch sau. 
//Những lần giao dịch khác nhau sẽ hoàn toàn độc lập với nhau.
@Stateless
@WebService
public class ScoreService {
	
	private static Score score = new Score();
	
	public Score getScore() {
		return score;
	}
	
	public Score updateScore(int wins, int losses, int ties) {
		score.wins = wins;
		score.losses = losses;
		score.ties = ties;
		return score;
	}
	
	@WebMethod(operationName="resetScore")
	public void reset() {
		score.wins = score.losses = score.ties = 0;
	}
	
	public int increaseWins() {return ++ score.wins;}
	public int increaseLosses() {return ++ score.losses;}
	public int increaseTies() {return ++ score.ties;}
	
	public int getWins() {return score.wins;}
	public int getLosses() {return score.losses;}
	public int getTies() {return score.ties;}
}
