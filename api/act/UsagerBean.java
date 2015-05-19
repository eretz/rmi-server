package act;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class UsagerBean implements Serializable {
	private static final long serialVersionUID = 227L;

	private int id;
	private String firstName;
	private String name;
	private boolean active;
	private Date dateAdmission;
	private Date dateEntree;
	private Date dateSortie;

	public UsagerBean() {}

	public UsagerBean(int id, String firstName, String name, boolean active, int [] dateAdmission,  int[] dateEntree, int[] dateSortie) {
		this.id = id;
		this.firstName = firstName;
		this.name = name;
		this.active = active;
		if (dateAdmission != null) {
			this.dateAdmission = new GregorianCalendar(dateAdmission[0], dateAdmission[1] -1, dateAdmission[2]).getTime();
		}
		if (dateEntree != null) {
			this.dateEntree = new GregorianCalendar(dateEntree[0], dateEntree[1] -1, dateEntree[2]).getTime();
		}
		if (dateSortie != null) {
			this.dateSortie = new GregorianCalendar(dateSortie[0], dateSortie[1] -1, dateSortie[2]).getTime();
		}
	}

	public int getId() { return this.id; }
	public void setId(int id) { this.id = id; }

	public String getFirstName() { return this.firstName; }
	public void setFirstName(String firstName) { this.firstName = firstName; }

	public String getName() { return this.name; }
	public void setName(String name) { this.name = name; }

	public boolean isActive() { return this.active; }
	public void setActive(boolean active) { this.active = active; }

	public Date getDateAdmission() { return this.dateAdmission; }
	public void setDateAdmission(Date dateAdmission) {this.dateAdmission = dateAdmission;}

	public Date getDateEntree() { return this.dateEntree; }
	public void setDateEntree(Date dateEntree) {this.dateEntree = dateEntree;}

	public Date getDateSortie() { return this.dateSortie; }
	public void setDateSortie(Date dateSortie) {this.dateSortie = dateSortie;}
}
