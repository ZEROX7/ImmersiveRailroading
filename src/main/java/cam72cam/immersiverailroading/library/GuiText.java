package cam72cam.immersiverailroading.library;

import cam72cam.immersiverailroading.util.TextUtil;

public enum GuiText {
	LABEL_BRAKE("label.brake"),
	LABEL_THROTTLE("label.throttle"),
	SELECTOR_TYPE("selector.type"),
	SELECTOR_QUARTERS("selector.quarters"),
	SELECTOR_RAIL_BED("selector.rail_bed"),
	SELECTOR_RAIL_BED_FILL("selector.rail_bed_fill"),
	SELECTOR_POSITION("selector.position"),
	SELECTOR_PLACE_BLUEPRINT("selector.place_blueprint"),

	TRACK_TYPE("track.type"),
	TRACK_LENGTH("track.length"),
	TRACK_QUARTERS("track.quarters"),
	TRACK_RAIL_BED("track.rail_bed"),
	TRACK_RAIL_BED_FILL("track.rail_bed_fill"),
	TRACK_POSITION("track.position"),
	TRACK_PLACE_BLUEPRINT_TRUE("track.place_blueprint_true"),
	TRACK_PLACE_BLUEPRINT_FALSE("track.place_blueprint_false"),
	
	LOCO_WORKS("loco.works"),
	LOCO_HORSE_POWER("loco.horse_power"),
	LOCO_MAX_SPEED("loco.max_speed"),
	
	NONE("none"),
	;
	
	private String value;
	GuiText(String value) {
		this.value = value;
	}
	
	public String getRaw() {
		return "gui.immersiverailroading:" + value;
	}

	@Override
	public String toString() {
		return TextUtil.translate(getRaw());
	}
	
	public String toString(Object...objects) {
		return TextUtil.translate(getRaw(), objects);
	}
}
