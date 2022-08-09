package hello.itemservice.domain.item;
/**상품 종류*/

public enum ItemType {
    BOOK("도서"), FOOD("식품"), ETC("기타");

    private final String description; //설명

    ItemType(String description) {
        this.description = description;
    }

    public String getDescription() {

        return description;
    }
}
