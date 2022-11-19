package sophisticated_wolves.api.pet_carrier;

import net.minecraft.world.entity.Entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Sophisticated Wolves
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class PetCarrierHandler {

    private static final Map<String, PetCarrier<Entity>> PETS_MAP = new HashMap<>();

    /**
     * Use it to add your own pet carrier
     */
    public static void addPet(PetCarrier petCarrier) {
        PETS_MAP.put(petCarrier.getPetClass().getSimpleName(), petCarrier);
    }

    /* call those methods only when "sophisticated wolves" mod loaded */
    /* otherwise PETS_MAP can be empty */

    public static Set<Map.Entry<String, PetCarrier<Entity>>> getPetCarriers() {
        return PETS_MAP.entrySet();
    }

    public static PetCarrier<Entity> getPetCarrier(Class pet) {
        return getPetCarrier(pet.getSimpleName());
    }

    public static PetCarrier<Entity> getPetCarrier(String pet) {
        return PETS_MAP.get(pet);
    }

    public static boolean hasPetCarrier(Class pet) {
        return hasPetCarrier(pet.getSimpleName());
    }

    public static boolean hasPetCarrier(String pet) {
        return PETS_MAP.containsKey(pet);
    }

}
