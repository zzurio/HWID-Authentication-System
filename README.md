# HWID-Authentication-System
A simple HWID authentication system for your minecraft mod.

This is a simple mod which can prevent unwanted users from running your mod by only allowing specific HWIDs to be able to run the mod.

## Usage

- Copy the classes into your mod.
- Go to `HWIDManager` and replace the empty string called `pastebinURL` to your **raw** pastebin URL link which contains your HWIDs.
- In your main mod class, add the function `HWIDManager.check();` on the `FMLPreInitializationEvent` as we want to check the user's HWID before doing anything. Refer to the main class `HWIDAuthMod` to see an example of how it's done.

## Versions
The HWID authentication system is not designed for a specific version of minecraft forge, you can use it in any minecraft forge version. 

## Credits

Thank you [SpartanB312](https://github.com/SpartanB312) for [Verificator](https://github.com/SpartanB312/Verificator).
