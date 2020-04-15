package ex;

/**
 * IDと名前のコンストラクタ
 */
public class Employee{
	private String id;
	private String name;
	
	/**
	 * IDと名前を格納
	 * @param id ID
	 * @param name 名前
	 */
	public Employee(String id,String name) {
		this.id = id;
		this.name = name;
	}
	
	/**
	 * IDを取得する
	 * @return ID
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * 名前を取得する。
	 * @return 名前
	 */
	public String getName() {
		return name;
	}
}
