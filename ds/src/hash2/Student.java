package hash2;

public class Student implements Comparable<Student>{

    private     int id;
    private String name;
    private String city;
    
    public Student (int _id, String _name, String _city) {
        id = _id;
        name = _name;
        city = _city;
    }

	public int getId () { return id;}
    public String getName () { return name;}
    public String getCity () { return city; }
 

    public String toString() {
        return "Id:" +id + ", Name:" + name + ", City "+city;
    }
	@Override
	public int compareTo(Student o) {
        return this.id - o.id;
	}

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public boolean equals(Object o) {
        if ( o instanceof Student) {                                 

          return this.getId() == ((Student)o).getId();
        }
        return false;

    }


}
