import React from "react";
import { Navigate } from "react-router";
import { useAuth } from "../hooks/useAuth";
import { useDispatch } from "react-redux";
import { removeUser } from "../features/user/UserSlice";
import Orders from "../components/Orders";
import { MyButton } from "../styles/buttons/buttons";
import { PageContainer } from "../styles/page/containers";
import { Typography } from "@mui/material";
import { Output } from "@mui/icons-material";

const AccountPage = () => {
  const dispatch = useDispatch();
  const { isAuth, email } = useAuth();

  const handleSignOut = () => {
    dispatch(removeUser());
  };

  if (!isAuth) {
    return <Navigate to="/login" />;
  }

  return (
    <PageContainer>
      <Typography variant="h4" mb="1rem">
        Welcome,
      </Typography>
      <Typography variant="h5" color="primary" mb="2rem">
        {email}
      </Typography>
      <Orders />
      <MyButton
        variant="contained"
        onClick={handleSignOut}
        endIcon={<Output />}
        aria-label="Sign out"
      >
        Sign out
      </MyButton>
    </PageContainer>
  );
};

export default AccountPage;
