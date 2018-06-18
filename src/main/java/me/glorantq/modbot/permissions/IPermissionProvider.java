package me.glorantq.modbot.permissions;

import sx.blah.discord.handle.obj.IGuild;
import sx.blah.discord.handle.obj.IRole;
import sx.blah.discord.handle.obj.IUser;

import java.util.List;

public interface IPermissionProvider {
    boolean checkUserPermission(IGuild guild, IUser user, String permissionNode);
    boolean checkRolePermission(IRole role, String permissionNode);
    boolean checkPermission(IGuild guild, IUser user, String permissionNode);

    PermissionState checkPermissionState(IGuild guild, IUser user, String permissionNode);
    PermissionState checkUserPermissionState(IGuild guild, IUser user, String permissionNode);
    PermissionState checkRolePermissionState(IRole role, String permissionNode);

    void addUserPermission(IGuild guild, IUser user, String permissionNode);
    void removeUserPermission(IGuild guild, IUser user, String permissionNode);
    void addRolePermission(IRole role, String permissionNode);
    void removeRolePermission(IRole role, String permissionNode);

    List<String> getUserPermissions(IGuild guild, IUser user);
    List<String> getRolePermissions(IRole role);

    enum PermissionState {
        UNKNOWN, ALLOWED, NEGATED
    }
}
