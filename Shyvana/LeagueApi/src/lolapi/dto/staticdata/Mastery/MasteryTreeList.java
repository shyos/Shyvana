/**
 * 
 */
package lolapi.dto.staticdata.Mastery;

import java.util.List;

/**
 * @author Shyos
 * 
 */
public class MasteryTreeList {
	private List<MasteryTreeItem> masteryTreeItems;

	/**
	 * @return the masteryTreeItems
	 */
	public List<MasteryTreeItem> getMasteryTreeItems() {
		return masteryTreeItems;
	}

	/**
	 * @param masteryTreeItems the masteryTreeItems to set
	 */
	public void setMasteryTreeItems(List<MasteryTreeItem> masteryTreeItems) {
		this.masteryTreeItems = masteryTreeItems;
	}
}
