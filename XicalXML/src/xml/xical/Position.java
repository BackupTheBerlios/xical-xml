/*
 * Date: 04.04.2006
 * Time: 19:25:57
 * Year: 2006
 * 
 * ProjektName: XicalEdit
 * User: Jens Kapitza
 * 
 */
package xml.xical;

/**
 * 
 * @author Jens Kapitza, E-Mail: j.kapitza@schwarze-allianz.de, ICQ. 234531384
 * 
 */
public class Position {

	private String elvo, audio, text, reply, comment, memo, note, type;

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
	 * @return Returns the comment.
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment
	 *            The comment to set.
	 */
	public void setComment(String comment) {
		this.comment = comment;
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
	 * @return Returns the memo.
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * @param memo
	 *            The memo to set.
	 */
	public void setMemo(String memo) {
		this.memo = memo;
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
	 * @return Returns the reply.
	 */
	public String getReply() {
		return reply;
	}

	/**
	 * @param reply
	 *            The reply to set.
	 */
	public void setReply(String reply) {
		this.reply = reply;
	}

	/**
	 * @return Returns the text.
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text
	 *            The text to set.
	 */
	public void setText(String text) {
		this.text = text;
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

}

/*
 * new File() a position in Xical
 * 
 */