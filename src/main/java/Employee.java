import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class Employee {
    private int id;
    private String name;
    private List<String> phoneNo;

    public Employee(int id, String name, List<String> phoneNo) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(List<String> phoneNo) {
        this.phoneNo = phoneNo;
    }
}
