package mittal.shivam.user.valueobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mittal.shivam.user.entity.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseTemplate {

    private User user;
    private Department department;
}
