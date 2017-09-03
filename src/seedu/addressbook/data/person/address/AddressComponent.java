package seedu.addressbook.data.person.address;

/**
 * A common interface for components of an address (block, street, unit, postal code).
 *
 * @author Niu Yunpeng
 */
public interface AddressComponent {
    /**
     * Three compulsory String constants for each address component.
     */
    String EXAMPLE = null;
    String MESSAGE_ADDRESS_CONSTRAINTS = null;
    String ADDRESS_VALIDATION_REGEX = null;

    /**
     * Checks whether the given string is valid to be used as this address component.
     *
     * @param address is the given string.
     * @return true if the given string is valid.
     */
    boolean isValidAddress(String address);
}