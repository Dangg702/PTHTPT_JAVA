package com.gpcoder.ws;
 
import java.util.HashMap;
import java.util.Map;
 
import javax.jws.WebService;

//@WebService đánh dấu class này như một WebService
//endpointInterface xđ đây là 1 implementation của WS Interface cụ thể
@WebService(endpointInterface = "com.gpcoder.ws.UserService")
public class UserServiceImpl implements UserService {
 
    // Map là một tập hợp các cặp key-value. Nó ánh xạ các key đến các value.
    // HashMap hoạt động dựa trên nguyên lý của việc băm dữ liệu
    // HashMap chỉ định các unique key cho các value tương ứng có thể được truy xuất tại bất kỳ thời điểm nào.
    // HashMap không thể chứa các key trùng lặp và cho phép các key null, value null.
    // HashMap không đảm bảo thứ tự của các phần tử khi được truy xuất.
    // HashMap không hỗ trợ đồng bộ(không phải thread-safe). 
    // HashMap chỉ lưu trữ các tham chiếu đến các đối tượng, nó không lưu trữ các đối tượng. --> Lý do không thể sử dụng các kiểu DL nguyên thủy như double, int,...Thay vào đó sd wrapper class như Double, Integer,...
    private static final Map<Integer, User> USERS = new HashMap<>();
 
    @Override
    public int insert(User user) {
        Integer id = generateUniqueId();
        user.setId(id);
        USERS.put(id, user);
        return id;
    }
 
    private int generateUniqueId() {
        // Phương thức keySet() trả về một tập hợp các key trong HashMap.
        return USERS.keySet().stream().max((x1, x2) -> x1 - x2).orElse(0) + 1;
    }
 
    @Override
    public boolean update(User user) {
        // Phương thức put() lưu trữ giá trị được chỉ định và liên kết nó với key được chỉ định trong map (thêm cặp key-value vào HashMap).
        // Nếu key đã tồn tại trong map, giá trị cũ sẽ bị ghi đè bởi giá trị mới.
        return USERS.put(user.getId(), user) != null;
    }
 
    @Override
    public boolean delete(int id) {
        return USERS.remove(id) != null;
    }
 
    @Override
    public User get(int id) {
        return USERS.getOrDefault(id, new User());
    }
 
    @Override
    public User[] getAll() {
        return USERS.values().toArray(new User[0]);
    }
}
