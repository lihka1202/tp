package model;

import java.util.ArrayList;
import java.util.UUID;

public class Tag {
    private UUID uuid;
    private String tagName;
    private ArrayList<UUID> cards = new ArrayList<>();

    public Tag (String tagName, UUID cardUUID) {
        this.tagName = tagName;
        this.uuid = UUID.randomUUID();
        cards.add(cardUUID);
    }

    public UUID getUUID() {
        return this.uuid;
    }
    public String getTagName() {
        return this.tagName;
    }

    public ArrayList<UUID> getCardsUUID() {
        return this.cards;
    }

    public void addCard(UUID cardUUID) {
        cards.add(cardUUID);
    }

    @Override
    public String toString() {
        return "Tag name : " + tagName + ", tag uuid : " + uuid;
    }
}
