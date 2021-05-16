package restaurant;

import java.util.Date;

public class Menu {

    private Date updatedDate;

    public Menu(Date updatedDate){
        this.updatedDate = updatedDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
