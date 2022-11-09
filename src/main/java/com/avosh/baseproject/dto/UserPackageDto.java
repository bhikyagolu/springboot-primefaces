/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.dto;

public class UserPackageDto extends BaseDto {

    private PackageDto packageDto;
    private UserDto userDto;

    public UserPackageDto() {
    }

    public UserPackageDto(Long id, PackageDto packageDto, UserDto userDto) {
        this.id = id;
        this.packageDto = packageDto;
        this.userDto = userDto;
    }

    public PackageDto getPackageDto() {
        return packageDto;
    }

    public void setPackageDto(PackageDto packageDto) {
        this.packageDto = packageDto;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }
}
