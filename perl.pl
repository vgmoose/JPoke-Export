use strict;
use File::Find ();

# Set the variable $File::Find::dont_use_nlink if you're using AFS,
# since AFS cheats.

# for the convenience of &wanted calls, including -eval statements:
use vars qw/*name *dir *prune/;
*name   = *File::Find::name;
*dir    = *File::Find::dir;
*prune  = *File::Find::prune;

sub wanted;



# Traverse desired filesystems
File::Find::find({wanted => \&wanted}, $ARGV[0]);
exit;


sub wanted {
    if ( `file $name -b` eq "Java KeyStore")
    {
        print("$name is a Java KeyStore");
    }
}

