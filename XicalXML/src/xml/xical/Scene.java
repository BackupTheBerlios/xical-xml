/*
 * Date: 04.04.2006
 * Time: 19:16:55
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
public class Scene {
	private Integer sceneNumber;

	private String title, template, elvo, overlay, audio, h, text1, text2,
			bigtext, note, target;

	private List positions;

	/**
	 * @return Returns the audio.
	 */
	public String getAudio() {
		return audio;
	}

	/**
	 * @param audio
	 *            The audio to set.
	 */
	public void setAudio(String audio) {
		this.audio = audio;
	}

	/**
	 * @return Returns the bigtext.
	 */
	public String getBigtext() {
		return bigtext;
	}

	/**
	 * @param bigtext
	 *            The bigtext to set.
	 */
	public void setBigtext(String bigtext) {
		this.bigtext = bigtext;
	}

	/**
	 * @return Returns the elvo.
	 */
	public String getElvo() {
		return elvo;
	}

	/**
	 * @param elvo
	 *            The elvo to set.
	 */
	public void setElvo(String elvo) {
		this.elvo = elvo;
	}

	/**
	 * @return Returns the h.
	 */
	public String getH() {
		return h;
	}

	/**
	 * @param h
	 *            The h to set.
	 */
	public void setH(String h) {
		this.h = h;
	}

	/**
	 * @return Returns the note.
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note
	 *            The note to set.
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * @return Returns the overlay.
	 */
	public String getOverlay() {
		return overlay;
	}

	/**
	 * @param overlay
	 *            The overlay to set.
	 */
	public void setOverlay(String overlay) {
		this.overlay = overlay;
	}

	/**
	 * @return Returns the positions.
	 */
	public List getPositions() {
		return positions;
	}

	/**
	 * @param positions
	 *            The positions to set.
	 */
	public void setPositions(List positions) {
		this.positions = positions;
	}

	/**
	 * @return Returns the sceneNumber.
	 */
	public Integer getSceneNumber() {
		return sceneNumber;
	}

	/**
	 * @param sceneNumber
	 *            The sceneNumber to set.
	 */
	public void setSceneNumber(Integer sceneNumber) {
		this.sceneNumber = sceneNumber;
	}

	/**
	 * @return Returns the target.
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * @param target
	 *            The target to set.
	 */
	public void setTarget(String target) {
		this.target = target;
	}

	/**
	 * @return Returns the template.
	 */
	public String getTemplate() {
		return template;
	}

	/**
	 * @param template
	 *            The template to set.
	 */
	public void setTemplate(String template) {
		this.template = template;
	}

	/**
	 * @return Returns the text1.
	 */
	public String getText1() {
		return text1;
	}

	/**
	 * @param text1
	 *            The text1 to set.
	 */
	public void setText1(String text1) {
		this.text1 = text1;
	}

	/**
	 * @return Returns the text2.
	 */
	public String getText2() {
		return text2;
	}

	/**
	 * @param text2
	 *            The text2 to set.
	 */
	public void setText2(String text2) {
		this.text2 = text2;
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
 * new File() a Scene in Xical
 * 
 */