package cms.user;

public class EditorUser extends User {

    public EditorUser(int id, String nome, String email, String password) {
        super(id, nome, email, password);
    }

    @Override
    public void performAction(int contentId, String body) {
        editContent(contentId, body);
    }

    public void editContent(int contentId, String body) {
        /* exclusivo do editor */
    }
}
