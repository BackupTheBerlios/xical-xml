/*
 * Date: 04.04.2006
 * Time: 19:17:17
 * Year: 2006
 * 
 * ProjektName: XicalEdit
 * User: Jens Kapitza
 * 
 */
package xml.xical;

import java.util.List;

/**
 * 
 * @author Jens Kapitza, E-Mail: j.kapitza@schwarze-allianz.de, ICQ. 234531384
 * 
 */
public class XicalDocument {

	private boolean saved;

	private String filePath;

	private String title;

	private List chapterList;

	private XicalAuthor author;

	private String type, price, license;

	/**
	 * @return Returns the author.
	 */
	public XicalAuthor getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            The author to set.
	 */
	public void setAuthor(XicalAuthor author) {
		this.author = author;
	}

	/**
	 * @return Returns the chapterList.
	 */
	public List getChapterList() {
		return chapterList;
	}

	/**
	 * @param chapterList
	 *            The chapterList to set.
	 */
	public void setChapterList(List chapterList) {
		this.chapterList = chapterList;
	}

	/**
	 * @return Returns the title.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            The title to set.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return Returns the license.
	 */
	public String getLicense() {
		return license;
	}

	/**
	 * @param license
	 *            The license to set.
	 */
	public void setLicense(String license) {
		this.license = license;
	}

	/**
	 * @return Returns the price.
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            The price to set.
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * @return Returns the type.
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            The type to set.
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return Returns the saved.
	 */
	public boolean isSaved() {
		return saved;
	}

	/**
	 * @param saved
	 *            The saved to set.
	 */
	public void setSaved(boolean saved) {
		this.saved = saved;
	}

	/**
	 * @return Returns the filePath.
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * @param filePath The filePath to set.
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}



}

/*
 * new File() store the Document as Java Object
 * 
 */