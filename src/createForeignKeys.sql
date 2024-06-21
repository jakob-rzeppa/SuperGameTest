ALTER TABLE
    `players` ADD CONSTRAINT `primaryWeapon_foreign` FOREIGN KEY(`primaryWeapon`) REFERENCES `items`(`id`);
ALTER TABLE
    `players` ADD CONSTRAINT `secondaryWeapon_foreign` FOREIGN KEY(`secondaryWeapon`) REFERENCES `items`(`id`);
ALTER TABLE
    `players` ADD CONSTRAINT `meleeWeapon_foreign` FOREIGN KEY(`meleeWeapon`) REFERENCES `items`(`id`);
    
ALTER TABLE
    `players` ADD CONSTRAINT `species_foreign` FOREIGN KEY(`species`) REFERENCES `species`(`id`);
ALTER TABLE
    `players` ADD CONSTRAINT `job_foreign` FOREIGN KEY(`job`) REFERENCES `jobs`(`id`);
    
ALTER TABLE
    `player_items` ADD CONSTRAINT `player_item_foreign` FOREIGN KEY(`player`) REFERENCES `players`(`id`);
ALTER TABLE
    `player_items` ADD CONSTRAINT `item_foreign` FOREIGN KEY(`item`) REFERENCES `items`(`id`);
    
ALTER TABLE
    `player_spells` ADD CONSTRAINT `player_spell_foreign` FOREIGN KEY(`player`) REFERENCES `players`(`id`);
ALTER TABLE
    `player_spells` ADD CONSTRAINT `spell_foreign` FOREIGN KEY(`spell`) REFERENCES `spells`(`id`);