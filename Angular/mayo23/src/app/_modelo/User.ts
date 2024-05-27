export interface User {
    _id: string;
    id: number;
    first_name: string;
    last_name: string;
    username: string;
    email: string;
    image: string;
    password: string;
  }

  type ApiResponse = {
    page: number;
    per_page: number;
    total: number;
    total_pages: number;
    results: User[];
  }