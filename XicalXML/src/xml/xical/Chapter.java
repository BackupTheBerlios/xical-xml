/*
 * Date: 04.04.2006
 * Time: 19:16:39
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
public class Chapter {
	private String title;

	private List sceneList;

	/**
	 * @return Returns the sceneList.
	 */
	public List getSceneList() {
		return sceneList;
	}

	/**
	 * @param sceneList
	 *            The sceneList to set.
	 */
	public void setSceneList(List sceneList) {
		this.sceneList = sceneList;
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

}

/*
 * new File()
 * a chapter in Xical
 * 
 */