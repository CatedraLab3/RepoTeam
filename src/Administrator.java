/**
 * Created by jiacontrerasp on 6/18/15.
 */
public class Administrator {
    String permissions;
    String role;

    public void addPermissions(String permissions) {
        this.permissions = permissions;
    }

    public void addRole(String role) {
        this.role = role;
    }

    public void removePermissions(String permissions) {
        this.permissions = permissions;
    }

    public void removeRole(String role) {
        this.role = role;
    }
}